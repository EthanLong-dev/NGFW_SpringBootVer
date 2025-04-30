//package tw.idv.tia202g1.core.config;
//
//import org.hibernate.dialect.MySQLDialect;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.Primary;
//import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
//import org.springframework.orm.jpa.JpaTransactionManager;
//import org.springframework.orm.jpa.JpaVendorAdapter;
//import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
//import org.springframework.orm.jpa.vendor.Database;
//import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
//import org.springframework.transaction.TransactionManager;
//import org.springframework.transaction.annotation.EnableTransactionManagement;
//
//import jakarta.sql.DataSource;
//
//@Configuration
//@EnableTransactionManagement
//@EnableJpaRepositories("win.TIA202.www.web.*.repository")
//public class SpringDataJpaConfig {
//
//    @Autowired
//    private DataSource dataSource;
//
//    @Bean
//    public JpaVendorAdapter jpaVendorAdapter() {
//        HibernateJpaVendorAdapter jpaVendorAdapter
//            = new HibernateJpaVendorAdapter();
//        jpaVendorAdapter.setDatabase(Database.MYSQL);
//        jpaVendorAdapter.setDatabasePlatform(MySQLDialect.class.getName());
//        jpaVendorAdapter.setShowSql(true);
//        return jpaVendorAdapter;
//    }
//
//    //  加上@Primary，不然會發生：expected single matching bean but found 2: sessionFactory,entityManagerFactory
//    @Bean
//    @Primary
//    public LocalContainerEntityManagerFactoryBean entityManagerFactory() {
//        LocalContainerEntityManagerFactoryBean entityManagerFactoryBean
//            = new LocalContainerEntityManagerFactoryBean();
//        entityManagerFactoryBean.setDataSource(dataSource);
//        entityManagerFactoryBean.setJpaVendorAdapter(jpaVendorAdapter());
//        entityManagerFactoryBean.setPackagesToScan("win.TIA202.www.web.*.entity");
//        entityManagerFactoryBean.afterPropertiesSet();
//        return entityManagerFactoryBean;
//    }
//
//    @Bean
//    public TransactionManager transactionManager() {
//        JpaTransactionManager txnManager = new JpaTransactionManager();
//        txnManager.setEntityManagerFactory(
//            entityManagerFactory().getObject());
//        return txnManager;
//    }
//}
