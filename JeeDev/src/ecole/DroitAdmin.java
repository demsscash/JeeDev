package ecole;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import ecole.Administrateur;



@Path("/admin")
@Consumes(MediaType.APPLICATION_JSON)
public class DroitAdmin {
		
	
	
	public Map<String,String>info=new HashMap<>();
	private static Map<Integer, Directeur> directeur=new HashMap<>();
	
	@GET
	@Path("/info")
	public Map getLogin() {
		info.put("login", Administrateur.getLogin());
		info.put("pass", Administrateur.getPass());
		return info;
	}
	
	@PUT
	@Path("/modifierInfo")
	public void insert(Data data) {
		Administrateur.setLogin(data.login);
		Administrateur.setPass(data.pass);
	}
	
	@GET
	@Path("/directeur/{code}")
	@Produces(MediaType.APPLICATION_JSON)
    public Directeur getDirecteur(@PathParam(value="code")int code){
		
    	return directeur.get(code);
    }
	@GET
	@Path("/directeur")
	@Produces(MediaType.APPLICATION_JSON)
    public List<Directeur> listDirecteur(){
    	return new ArrayList<>(directeur.values());
    }
	@POST
	@Path("/directeur")
	@Produces(MediaType.APPLICATION_JSON)
	public Directeur save(Directeur dr){
		directeur.put(dr.getCode(), dr);
		return dr;
	}
	@PUT
	@Path("/directeur/{code}")
	@Produces(MediaType.APPLICATION_JSON)
	public Directeur update(Directeur dr,@PathParam("code") int code){
		directeur.put(code, dr);
		return dr;
	}
	@DELETE
	@Path("/directeur/{code}")
	@Produces(MediaType.APPLICATION_JSON)
	public boolean delete(@PathParam("code") int code){
		directeur.remove(code);
		return true;
	}

}
