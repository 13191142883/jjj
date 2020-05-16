package jdbc;

import org.hibernate.envers.internal.entities.mapper.PropertyMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import javax.swing.text.DateFormatter;
import javax.transaction.Transactional;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.text.DateFormat;
import java.util.Date;
import java.util.List;

@Component

public class JdbcTest {

    @Autowired
    public JdbcTemplate jdbcTemplate;

    public void insertTest(){

        jdbcTemplate.update("insert into person(name, carid) value(?,?)",new Object[]{"ssh",1},new int[]{Types.VARCHAR,Types.INTEGER});
    }

    public void selectTest(){
        RowMapper rowMapper = new RowMapper() {
            @Override
            public Object mapRow(ResultSet resultSet, int i) throws SQLException {
                PersonEntity personEntity = new PersonEntity();
                personEntity.setName(resultSet.getString("name"));

                return personEntity;
            }
        };
        PersonEntity personEntity = (PersonEntity) jdbcTemplate.queryForObject("select * from person where id=?",new Object[]{1}, rowMapper);
        System.out.println(personEntity.getName());
    }

    public List selectAll(){
        RowMapper rowMapper = new RowMapper() {
            @Override
            public Object mapRow(ResultSet resultSet, int i) throws SQLException {
                PersonEntity personEntity = new PersonEntity();
                personEntity.setName(resultSet.getString("name"));
                personEntity.setId(resultSet.getInt("id"));
                personEntity.setCarid(resultSet.getInt("carid"));

                return personEntity;
            }
        };

        List list = jdbcTemplate.query("select * from person where id>?",new Object[]{3},rowMapper);

        return list;
    }

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        JdbcTest jdbcTest = (JdbcTest) applicationContext.getBean("jdbcTest");

        jdbcTest.insertTest();

        jdbcTest.selectTest();

        List list = jdbcTest.selectAll();
        for (Object object:list){
            if (object instanceof PersonEntity){
                PersonEntity personEntity = (PersonEntity) object;
                System.out.println(personEntity);
            }
        }
    }

}
