
package utilities;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import security.UserAccount;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import domain.Administrator;
import domain.DomainEntity;

public class Json {

	static final List<DomainEntity>	objectList	= new ArrayList<DomainEntity>();
	static int						id			= 0;


	public static void main(final String[] args) {
		//Para parsear las fechas
		//final Gson gson = new GsonBuilder().setDateFormat("dd/MM/yyyy").create();
		final BufferedReader reader;
		final JsonParser parser;
		try {
			parser = new JsonParser();
			reader = new BufferedReader(new FileReader("./src/main/java/utilities/json.txt"));
			final JsonElement datos = parser.parse(reader);
			Json.dumpJSONElement(datos);
			System.out.println(Json.objectList);
		} catch (final FileNotFoundException e) {
			e.printStackTrace();
		}

	}
	public static void dumpJSONElement(final JsonElement elemento) {
		DomainEntity object;
		final JsonObject jsonObject = elemento.getAsJsonObject();
		final java.util.Set<java.util.Map.Entry<String, JsonElement>> entradas = jsonObject.entrySet();
		for (final java.util.Map.Entry<String, JsonElement> map : entradas)
			if (map.getValue().isJsonArray()) {
				//Si es un array significa que hay m�s de un objeto de esa clase
				final JsonArray array = map.getValue().getAsJsonArray();
				final java.util.Iterator<JsonElement> iter = array.iterator();
				while (iter.hasNext()) {
					final JsonElement entrada = iter.next();
					object = Json.devuelveObjetoJava(map.getKey(), entrada);
					if (object != null) {
						Json.id++;
						object.setId(Json.id);
						Json.objectList.add(object);
					} else
						System.out.println("ERROR: Don't exist the domain with name: " + map.getKey());
				}
			} else {
				object = Json.devuelveObjetoJava(map.getKey(), map.getValue());
				if (object != null) {
					Json.id++;
					object.setId(Json.id);
					Json.objectList.add(object);
				} else
					System.out.println("ERROR: Don't exist the domain with name: " + map.getKey());

			}
	}
	private static DomainEntity devuelveObjetoJava(final String domain, final JsonElement jsonElement) {
		final Gson gson = new GsonBuilder().setDateFormat("dd/MM/yyyy").create();
		DomainEntity res = null;
		switch (domain) {
		case "Empresa":
			res = gson.fromJson(jsonElement, Empresa.class);
		case "UserAccount":
			res = gson.fromJson(jsonElement, UserAccount.class);
		case "Administrator":
			res = gson.fromJson(jsonElement, Administrator.class);

		}

		return res;
	}

	//	public static void main(final String[] args) {
	//		//Para parsear las fechas
	//		//final Gson gson = new GsonBuilder().setDateFormat("dd/MM/yyyy").create();
	//		final Gson gson = new Gson();
	//		final BufferedReader reader;
	//		final JsonParser parser;
	//		try {
	//			parser = new JsonParser();
	//			reader = new BufferedReader(new FileReader("./src/main/java/utilities/json.txt"));
	//			//final Empresa empresa = gson.fromJson(reader, Empresa.class);
	//			//System.out.println(empresa.getNombre());
	//			final JsonElement datos = parser.parse(reader);
	//			final JsonArray array = datos.getAsJsonArray();
	//			final java.util.Iterator<JsonElement> iter = array.iterator();
	//			while (iter.hasNext()) {
	//				System.out.println("Entra en while");
	//				final JsonElement entrada = iter.next();
	//				Json.dumpJSONElement(entrada);
	//			}
	//		} catch (final FileNotFoundException e) {
	//			e.printStackTrace();
	//		}
	//
	//	}
	//	public static void dumpJSONElement(final JsonElement elemento) {
	//		DomainEntity objeto;
	//		final JsonObject obj = elemento.getAsJsonObject();
	//		final java.util.Set<java.util.Map.Entry<String, JsonElement>> entradas = obj.entrySet();
	//		for (final java.util.Map.Entry<String, JsonElement> map : entradas) {
	//			objeto = Json.devuelveObjetoJava(map);
	//			System.out.println(objeto);
	//		}
	//	}
	//	private static DomainEntity devuelveObjetoJava(final java.util.Map.Entry<String, JsonElement> map) {
	//		final Gson gson = new Gson();
	//		DomainEntity res = null;
	//		final String domain = map.getKey();
	//		switch (domain) {
	//		case "Empresa":
	//			res = gson.fromJson(map.getValue(), Empresa.class);
	//
	//		}
	//
	//		return res;
	//	}
}
