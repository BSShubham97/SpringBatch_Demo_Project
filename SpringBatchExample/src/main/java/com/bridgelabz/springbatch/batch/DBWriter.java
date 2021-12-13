package com.bridgelabz.springbatch.batch;

import java.util.List;

import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.bridgelabz.springbatch.model.User;
import com.bridgelabz.springbatch.repository.UserRepository;

@Component
public class DBWriter  implements ItemWriter<User>{
	 private UserRepository userRepository;

	    @Autowired
	    public DBWriter (UserRepository userRepository) {
	        this.userRepository = userRepository;
	    }

	    @Override
	    public void write(List<? extends User> users) throws Exception{
	        System.out.println("Data Saved for Users: " + users);
	        for (User user : users) {
				System.out.println(user);
				userRepository.save(user);
			}

	    }

}
