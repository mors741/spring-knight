package com.mors741.knight;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {KnightConfig.class})
@ActiveProfiles("dev")
public class JavaConfigTest {

    @Autowired
    private Knight knight;

    @Test
    public void embark() throws Exception {
        knight.embarkOnQuest(125);
    }

}
