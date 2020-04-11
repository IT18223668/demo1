package service;

import model.*;

import java.sql.SQLException;
import java.util.ArrayList;

public interface EmpService {

	public ArrayList<employee> getEmpSal() throws ClassNotFoundException ,SQLException;
}
