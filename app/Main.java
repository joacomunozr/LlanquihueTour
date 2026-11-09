package app;

import model.Direccion;
import model.Empleado;

public class Main {
    public static void main(String[] args) {
        Direccion d1 = new Direccion("Vicente Pérez Rosales", 450, "Llanquihue");
        Direccion d2 = new Direccion("Costanera Theodoro Hold", 120, "Llanquihue");
        Direccion d3 = new Direccion("Calle Techada", 89, "Puerto Varas");

        Empleado e1 = new Empleado("15.987.321-K", "Mateo Soto", "mateo.soto@llanquihuetour.cl", d1, "Guía Lacustre Senior", 6);
        Empleado e2 = new Empleado("17.456.789-2", "Camila Mansilla", "camila.mansilla@llanquihuetour.cl", d2, "Coordinadora de Rutas", 4);
        Empleado e3 = new Empleado("16.111.222-3", "Esteban Andrade", "esteban.andrade@llanquihuetour.cl", d3, "Operador Logístico", 5);

        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);
    }
}