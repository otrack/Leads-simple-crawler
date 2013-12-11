package eu.leads.crawler.frontier;

import eu.leads.crawler.model.CrawlerTask;
import eu.leads.crawler.model.Page;

import java.util.HashMap;
import java.util.Map;

/**
 *  *
 * @author otrack
 * @since 4.0
 */
public class DefaultStatisticsService implements StatisticsService {

    private Map<String,DomainStatistics> domainStatistics;

    public DefaultStatisticsService(){
             domainStatistics = new HashMap<String, DomainStatistics>();
    }

    @Override
    public boolean isCrawled(String url) {
        return false;  // TODO: Customise this generated block
    }

    @Override
    public void afterScheduling(CrawlerTask task) {
        // TODO: Customise this generated block
    }

    @Override
    public void afterDownloading(CrawlerTask task, Page page) {
        // TODO: Customise this generated block
    }

    @Override
    public void afterParsing(CrawlerTask task, Page page) {
        // TODO: Customise this generated block
    }

    @Override
    public synchronized DomainStatistics getDomainStatistics(String domainName) {
        if(!domainStatistics.containsKey(domainName)){
            domainStatistics.put(domainName,new DomainStatistics(domainName));
        }
        return domainStatistics.get(domainName);
    }

    @Override
    public long getScheduled() {
        return 0;  // TODO: Customise this generated block
    }

    @Override
    public long getDownloaded() {
        return 0;  // TODO: Customise this generated block
    }

    @Override
    public long getParsed() {
        return 0;  // TODO: Customise this generated block
    }

    @Override
    public long getErrors() {
        return 0;  // TODO: Customise this generated block
    }

    @Override
    public void dispose() {
        // TODO: Customise this generated block
    }
}
