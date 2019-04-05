/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import models.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author macedo
 */
public class UsuarioDAO {

    List<Usuario> lista = new ArrayList<Usuario>();
    Connection connection = ConnectionFactory.getConnection();
    PreparedStatement st = null;
    ResultSet rs = null;

    public List<Usuario> getAll() {
        try {
            st = connection.prepareStatement("SELECT id_usuario, login_usuario, senha_usuario, nome_usuario FROM tb_usuario");
            rs = st.executeQuery();
            while (rs.next()) {
                Usuario novoUsuario = new Usuario();
                novoUsuario.setId(rs.getInt("id_usuario"));
                novoUsuario.setLogin(rs.getString("login_usuario"));
                novoUsuario.setSenha(rs.getString("senha_usuario"));
                novoUsuario.setNome(rs.getString("nome_usuario"));

                lista.add(novoUsuario);
            }
        } catch (Exception e) {
            System.out.println("Erro" + e);
        }

        return lista;
    }

    public Usuario inserirUsuario(Usuario usuario) {
        try {
            st = connection.prepareStatement("insert into tb_usuario values(?, ?, ?, ?)");
            st.setInt(1, usuario.getId());
            st.setString(2, usuario.getLogin());
            st.setString(3, usuario.getSenha());
            st.setString(4, usuario.getNome());
            st.executeUpdate();
        } catch (Exception e) {
            System.out.println("Erro" + e);
        }

        return usuario;
    }
}
