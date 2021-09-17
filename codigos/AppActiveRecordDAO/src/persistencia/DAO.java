/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import negocio.Pessoa;

/**
 *
 * @author iapereira
 */
public interface DAO<Modelo> {    
    public void obter(Modelo p) throws SQLException;
    public ArrayList<Modelo> listar() throws SQLException;
    public void inserir(Modelo p) throws SQLException;
    public void excluir(String chave) throws SQLException;
    public void atualizar(Modelo p) throws SQLException;
    
}
