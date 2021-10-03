package com.hungle.mbf.logindemo;

import com.hungle.mbf.logindemo.entities.Users;
import com.hungle.mbf.logindemo.repository.UserRepository;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.annotation.Rollback;

import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Rollback(value = false)
public class UserRepoTest {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private TestEntityManager entityManager;

    @Test
    public void testCreateUser() {
        Users user = new Users();
        user.setUsername("tvt2299");
        user.setPassword("123456");
        user.setFirstName("Trinh");
        user.setLastName("Thang");

        Users savedUser = userRepository.save(user);
        Users existingUser = entityManager.find(Users.class, savedUser.getId());
        assertThat(existingUser.getUsername()).isEqualTo(user.getUsername());
    }

}
