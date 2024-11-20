package gdu.k16.java_API_221403.demoRestfulAPI.model;

import org.springframework.data.jpa.repository.JpaRepository;

//Khai báo Framework để truy vấn
public interface IMyDB extends JpaRepository<Product, Integer>  {

}
