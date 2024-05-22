package dh.backend.dao.impl;

import dh.backend.dao.IDao;
import dh.backend.model.Odontologo;
import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public class OdontologoEnMemoria implements IDao<Odontologo> {
    private Logger LOGGER = Logger.getLogger(OdontologoDaoH2.class);
    List<Odontologo> odontologos = new ArrayList<>();


    @Override
    public Odontologo registrar(Odontologo odontologo) {
        Integer id = odontologos.size()+1;
        odontologo.setId(id);
        odontologos.add(odontologo);
        LOGGER.info("Odontologo registrado: " + odontologo);
        return odontologo;
    }

    @Override
    public List<Odontologo> listarTodos() {
        return odontologos;
    }
}
