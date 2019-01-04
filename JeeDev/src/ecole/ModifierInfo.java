package ecole;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import ecole.Administrateur;
@Path("/modifier")
@Consumes(MediaType.APPLICATION_JSON)
public class ModifierInfo {
		
	
	
	public Map<String,String>info=new HashMap<>();
	
	@GET
	public Map getLogin() {
		info.put("login", Administrateur.getLogin());
		info.put("pass", Administrateur.getPass());
		return info;
	}
	
	@PUT
	
	public void insert(Data data) {
		Administrateur.setLogin(data.login);
		Administrateur.setPass(data.pass);
	}
	

}
