package xyz.chamc.resttobatch;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;
import org.springframework.stereotype.Component;

@Component
public class Tasklet3 implements Tasklet {

    private static final Logger logger = LoggerFactory.getLogger(Tasklet3.class);

    public RepeatStatus execute(StepContribution sc, ChunkContext cc) throws Exception {
        logger.info("!!!!!!!!!!!!!!!!!!!! execute Tasklet1 !!!!!!!!!!!!!!!!!!!!");
        return RepeatStatus.FINISHED;
    }

}
