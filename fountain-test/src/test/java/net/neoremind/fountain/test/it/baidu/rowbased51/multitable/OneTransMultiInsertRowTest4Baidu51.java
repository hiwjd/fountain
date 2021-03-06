package net.neoremind.fountain.test.it.baidu.rowbased51.multitable;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import net.neoremind.fountain.test.it.template.multitable.OneTransMultiInsertRowTest;

/**
 * 一个事务多条insert数据，分了两张表，student表先插入5条，之后city表再插入3条
 *
 * @author zhangxu
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:baidu/rowbased51/fountain-config.xml"})
public class OneTransMultiInsertRowTest4Baidu51 extends OneTransMultiInsertRowTest {

    @Test
    public void testOneTransMultiInsertRow() {
        super.testOneTransMultiInsertRow();
    }

}