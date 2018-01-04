package converter;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.ConverterException;

import org.comenzi.model.Client;
import org.comenzi.model.Produs;

import form.JpaUtil;

public class ProdusConverter implements Converter {

	public ProdusConverter() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Object getAsObject(FacesContext arg0, UIComponent arg1, String string) throws ConverterException {		
		return JpaUtil.getEmf().createEntityManager().find(Produs.class, Integer.valueOf(string));
	}

	@Override
	public String getAsString(FacesContext arg0, UIComponent arg1, Object object) throws ConverterException {
		if (object == null) return null;
		Produs produs = (Produs)object;
		return produs.getCod().toString();
	}

}
