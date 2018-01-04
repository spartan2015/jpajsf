package converter;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.ConverterException;

import org.comenzi.model.Client;

import form.JpaUtil;

public class ClientConverter implements Converter {

	public ClientConverter() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Object getAsObject(FacesContext arg0, UIComponent arg1, String string) throws ConverterException {		
		return JpaUtil.getEmf().createEntityManager().find(Client.class, Integer.valueOf(string));
	}

	@Override
	public String getAsString(FacesContext arg0, UIComponent arg1, Object object) throws ConverterException {
		if (object == null) return null;
		Client client = (Client)object;
		return client.getId().toString();
	}

}
