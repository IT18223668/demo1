package service;

import model.appointment_payment;
import java.sql.SQLException;
import java.util.ArrayList;

public interface App_pys_service {

	public ArrayList<appointment_payment> getAppPym() throws ClassNotFoundException,SQLException;
}
