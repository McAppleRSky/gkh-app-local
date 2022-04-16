package ru.git.gkh.gis.task;

import org.junit.jupiter.api.Test;
import ru.git.gkh.capremont.tasks.TaskParams;
import ru.git.gkh.dto.debtRequests.DebtRequestFilterDto;
import ru.git.gkh.system.handbooks.DebtRequestBean;
import ru.git.gkh.utils.task.TaskObserver;
import ru.git.gkh.utils.task.TaskSseEvent;

import static org.junit.jupiter.api.Assertions.*;

class FormResponsesTaskTest {

    /*FormResponsesTask formResponsesTask;
    TaskObserver taskObserver;
    {
        taskObserver = new TaskObserver() {
            @Override
            public void handleEvent(TaskSseEvent event) {
            }
        };
    }*/
    DebtRequestBean debtRequestBean;

    @Test
    void testDivide() {
        /*TaskParams taskParams = new TaskParams(null, taskObserver, Long.MAX_VALUE, "null", "null");
        formResponsesTask = new FormResponsesTask(taskParams, new DebtRequestBean());*/
        debtRequestBean = new DebtRequestBean();
//        debtRequestBean.startFormResponsesTask(new DebtRequestFilterDto());
        int i;
        try {
            i = debtRequestBean.formResponses(new DebtRequestFilterDto());
        } catch (Exception e) {
            e.printStackTrace();
        }
        assertTrue(false);
    }

}
