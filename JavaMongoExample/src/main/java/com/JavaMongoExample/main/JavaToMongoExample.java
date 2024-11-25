package com.JavaMongoExample.main;

import java.util.ArrayList;
import java.util.List;
import org.bson.Document;
import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;

public class JavaToMongoExample {

	public static void main(String[] args) {
	

		//connecting database
		MongoClient mongoClient = new MongoClient("localhost",27017);
		System.out.println("mongodb connected");

		//creating database
		MongoDatabase db = mongoClient.getDatabase("school");
		System.out.println("database created");	
		
		//create a new collection
		db.createCollection("student");
		
		//Access the collection
		MongoCollection<Document> table = db.getCollection("student");
		System.out.println("collection created");
		
		//list out the databases
//		for (String name : mongoClient.listDatabaseNames()) 
//		{
//			System.out.println(name);
//		}
		
		//list out the Collections
//		for(String name : db.listCollectionNames())
//		{
//			System.out.println(name);
//		}
		
		
//		creating document
		Document doc = new Document("name","karthik");
		doc.append("Age",21);
		doc.append("city", "Chennai");

		Document doc1 = new Document("name","Sudalai");
		doc1.append("Age",23);
		doc1.append("city", "Trichy");
		
		Document doc2= new Document("name","karthik");
		doc2.append("Age", 22);
		doc2.append("city", "Chennai");
		
		Document doc3 = new Document("name","Senthil");
		doc3.append("Age", 24);
		doc3.append("city", "Erode");

		List<Document> list = new ArrayList<Document>();
		list.add(doc);
		list.add(doc1);
		list.add(doc2);
		list.add(doc3);
		
//		check if two names same but different age and city fields are inserted in the document 			
		Document filter = new Document("name",doc.getString("name"));
		
//		check if name already exists or inserted
//		if(table.find(new Document("name",doc.getString("name"))).first()==null)
		if(table.find(filter).first()==null)
		{
			table.insertMany(list);
			System.out.println("Document inserted"+list);
		}
		else
		{
			System.out.println("duplicate Document found , not inserted"+list);
		} 
		
		
//		MongoCursor<Document> itr = table.find().iterator();
//		while(itr.hasNext())
//		{
//			System.out.println(itr.next());
//		}
//		
		
//		table.deleteMany(doc1);
		
	}

}
