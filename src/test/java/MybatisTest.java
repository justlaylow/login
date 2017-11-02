

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.tl.login.mapper.AdminMapper;
import com.tl.login.pojo.Admin;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class MybatisTest {

	@Autowired
	private AdminMapper adminMapper;

	@Test
	public void testAdd() {
		Admin admin = new Admin();
		admin.setAdm_count("adm_count");
		adminMapper.add(admin);
	}

	@Test
	public void testList() {
		System.out.println(adminMapper);
		List<Admin> cs=adminMapper.list();
		for (Admin c : cs) {
			System.out.println(c.getAdm_count());
		}
	}

}
