package cn.kiiwii.framework.druid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

import com.alibaba.druid.filter.logging.Log4jFilter;

@Component
public class ExecuteSqlFilter extends Log4jFilter implements InitializingBean {
    private Logger statementLogger = LoggerFactory.getLogger(ExecuteSqlFilter.class);
 
    public ExecuteSqlFilter() {
        this.setStatementExecutableSqlLogEnable(true);
        this.setResultSetLogEnabled(false);
        this.setConnectionLogEnabled(false);
        this.setDataSourceLogEnabled(false);
        this.setStatementCreateAfterLogEnabled(false);
        this.setStatementPrepareAfterLogEnabled(false);
        this.setStatementPrepareCallAfterLogEnabled(false);
        this.setStatementExecuteAfterLogEnabled(false);
        this.setStatementExecuteQueryAfterLogEnabled(false);
        this.setStatementExecuteUpdateAfterLogEnabled(false);
        this.setStatementExecuteBatchAfterLogEnabled(false);
        this.setStatementCloseAfterLogEnabled(false);
        this.setStatementParameterSetLogEnabled(false);
        this.setStatementParameterClearLogEnable(false);
        this.setStatementLogErrorEnabled(false);
    }

	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		
	}
}