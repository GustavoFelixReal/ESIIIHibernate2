package ESIIIHibernateDDL2.util;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

import ESIIIFactoryATS.model.Funcionario;
import ESIIIHibernateDDL2.model.Atendente;
import ESIIIHibernateDDL2.model.Atendimento;
import ESIIIHibernateDDL2.model.Cliente;
import ESIIIHibernateDDL2.model.Entregador;

public class HibernateUtil {
  private static SessionFactory sessionFactory;

  public static SessionFactory getSessionFactory() {
    if (sessionFactory == null) {
      try {
        Configuration configuration = new Configuration();

        Properties settings = new Properties();
        settings.put(Environment.DRIVER, "com.mysql.cj.jdbc.Driver");
        settings.put(Environment.URL, "jdbc:mysql://localhost:3306/MDR03Ex1?createDatabaseIfNotExist=true");
        settings.put(Environment.USER, "root");
        settings.put(Environment.PASS, "root");
        settings.put(Environment.DIALECT, "org.hibernate.dialect.MySQLDialect");
        settings.put(Environment.SHOW_SQL, "true");
        settings.put(Environment.CURRENT_SESSION_CONTEXT_CLASS, "thread");
        settings.put(Environment.HBM2DDL_AUTO, "update");

        configuration.setProperties(settings);
        configuration.addAnnotatedClass(Funcionario.class);
        configuration.addAnnotatedClass(Atendente.class);
        configuration.addAnnotatedClass(Entregador.class);
        configuration.addAnnotatedClass(Cliente.class);
        configuration.addAnnotatedClass(Atendimento.class);

        ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
            .applySettings(configuration.getProperties()).build();

        sessionFactory = configuration.buildSessionFactory(serviceRegistry);
      } catch (Exception e) {
        e.printStackTrace();
      }
    }

    return sessionFactory;
  }

}
