package level3.context;

import level3.strategy.ReportStrategy;

import java.io.File;

public class Context {

    private ReportStrategy strategy;

    public Context(ReportStrategy strategy) {
        setStrategy(strategy);

    }

    public void setStrategy(ReportStrategy strategy){

        if(strategy == null){
            throw new IllegalArgumentException("Strategy cannot be null");
        }

        this.strategy = strategy;
    }



    public String executeReport(String filename){
        if(filename == null || filename.isBlank()){
            throw new IllegalArgumentException("No strategy implemented");
        }


        return strategy.generateReport(new File(filename));
    }
}
