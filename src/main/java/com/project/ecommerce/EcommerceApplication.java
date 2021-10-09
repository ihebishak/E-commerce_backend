package com.project.ecommerce;

import com.project.ecommerce.dao.CategoryRepository;
import com.project.ecommerce.dao.ProductRepository;
import com.project.ecommerce.entity.Category;
import com.project.ecommerce.entity.Product;
import net.bytebuddy.utility.RandomString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Random;

@SpringBootApplication
public class EcommerceApplication implements CommandLineRunner {
	@Autowired
	private ProductRepository productRepository;
	@Autowired
	private CategoryRepository categoryRepository;


	public static void main(String[] args) {
		SpringApplication.run(EcommerceApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {


		/*categoryRepository.save(new Category(null,"Computers",null,null,null));
		categoryRepository.save(new Category(null,"Printers",null,null,null));
		categoryRepository.save(new Category(null,"Smart phones",null,null,null));

		Random rnd=new Random();
		categoryRepository.findAll().forEach(c->{
			for (int i = 0; i <5 ; i++) {
				Product p=new Product();
				p.setName(RandomString.make(18));
				p.setCurrentPrice(100+rnd.nextInt(10000));
				p.setAvailable(rnd.nextBoolean());
				p.setPromotion(rnd.nextBoolean());
				p.setSelected(rnd.nextBoolean());
				p.setCategory(c);
				p.setPhotoName("unknown.png");
				productRepository.save(p);
			}
		});*/


	}
}
