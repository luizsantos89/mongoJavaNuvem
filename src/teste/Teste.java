
package teste;

import com.mongodb.BasicDBObject;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

        
public class Teste {
    
    public static void main(String[] args) {
        Document contatoDAO = new Document();
        contatoDAO.put("nome","Luiz Santos");
        contatoDAO.put("email","luiz.santos89@yahoo.com.br");
        contatoDAO.put("rua","Euclides Pezarini");
        contatoDAO.put("numero","215");
        contatoDAO.put("complemento","T 501");
        contatoDAO.put("bairro","São Pedro");
        contatoDAO.put("cep","36037-155");
        contatoDAO.put("cidade","Juiz de Fora");
        contatoDAO.put("estado","Minas Gerais");
        contatoDAO.put("telResidencial","32 3232-9388");
        contatoDAO.put("telComercial","32 3239-5649");
        contatoDAO.put("telCelular","32 99165-3143");
        
        System.out.println(contatoDAO);
        
        MongoClientURI uri = 
                new MongoClientURI("mongodb://dbuser:dbuser@ds163918.mlab.com:63918/androiddev?connectTimeoutMS=300000");
        MongoClient client = new MongoClient(uri);
        MongoDatabase banco = client.getDatabase("androiddev");
        MongoCollection<Document> contatos = banco.getCollection("pessoas");
        
        contatos.insertOne(contatoDAO);   
        
    }
    
}
