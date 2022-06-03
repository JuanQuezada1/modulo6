package cl.aiep.java.cft.repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import cl.aiep.java.cft.Alumno;

@Repository
public class AlumnoRepositoryImp implements AlumnoRepository{
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	private Alumno makeObject(ResultSet rs, int fileNum) throws SQLException {
		return new Alumno(rs.getInt("id"), rs.getString("nombre"), rs.getInt("edad"));
	}

	@Override
	public List<Alumno> findAll() {
		return jdbcTemplate.query("SELECT * FROM alumnos2", this::makeObject);
	}

	@Override
	public Alumno findById(int id) {
		return jdbcTemplate.queryForObject("SELECT * FROM alumnosact2 WHERE id = ?", this::makeObject, id);
	}

	@Override
	public void create(Alumno alumno) {
		String sql = "INSERT INTO alumnos(nombre, edad) VALUE = (?, ?)";
		jdbcTemplate.update(sql, alumno.getNombre(), alumno.getEdad());
		
	}

	@Override
	public void edit(Alumno alumno) {
		String sql = "UPDATE alumno SET nombre = ?, edad = ?m WHERE id = ?";
		jdbcTemplate.update(
				sql, 
				alumno.getNombre(), 
				alumno.getEdad(),
				alumno.getId()
			);
		
	}

	@Override
	public void delete(int id) {
		String sql = "DELETE FROM alumnos2 WHERE id =?";
		jdbcTemplate.update(sql, id);
		
	}

}
