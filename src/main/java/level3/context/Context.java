package level3.context;

import level3.strategy.ReportStrategy;

import java.io.File;

public class Context {

    private ReportStrategy strategy;


    public void setStrategy(ReportStrategy strategy) {
        this.strategy = strategy;
    }


    public String executeReport(String filename){
        if(strategy == null){
            throw new IllegalStateException("No strategy implemented");
        }
        if(filename.isBlank()){
            throw new IllegalArgumentException(("No name file"));
        }

        return strategy.generateReport(new File(filename));
    }
}
