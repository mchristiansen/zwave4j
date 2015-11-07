package org.zwave4j;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zagumennikov
 */
public class NodeData {
    
    private long sentCnt;
    private long sentFailed;
    private long retries;
    private long receivedCnt;
    private long receivedDups;
    private long receivedUnsolicited;
    private String sentTs;
    private String receivedTs;
    private long lastRequestRtt;
    private long averageRequestRtt;
    private long lastResponseRtt;
    private long averageResponseRtt;
    private short quality;
    private short[] lastReceivedMessage = new short[254];
    private List<CommandClassData> ccData = new ArrayList<>();

    public long getSentCnt() {
        return sentCnt;
    }

    public void setSentCnt(long sentCnt) {
        this.sentCnt = sentCnt;
    }

    public long getSentFailed() {
        return sentFailed;
    }

    public void setSentFailed(long sentFailed) {
        this.sentFailed = sentFailed;
    }

    public long getRetries() {
        return retries;
    }

    public void setRetries(long retries) {
        this.retries = retries;
    }

    public long getReceivedCnt() {
        return receivedCnt;
    }

    public void setReceivedCnt(long receivedCnt) {
        this.receivedCnt = receivedCnt;
    }

    public long getReceivedDups() {
        return receivedDups;
    }

    public void setReceivedDups(long receivedDups) {
        this.receivedDups = receivedDups;
    }

    public long getReceivedUnsolicited() {
        return receivedUnsolicited;
    }

    public void setReceivedUnsolicited(long receivedUnsolicited) {
        this.receivedUnsolicited = receivedUnsolicited;
    }

    public String getSentTs() {
        return sentTs;
    }

    public void setSentTs(String sentTs) {
        this.sentTs = sentTs;
    }

    public String getReceivedTs() {
        return receivedTs;
    }

    public void setReceivedTs(String receivedTs) {
        this.receivedTs = receivedTs;
    }

    public long getLastRequestRtt() {
        return lastRequestRtt;
    }

    public void setLastRequestRtt(long lastRequestRtt) {
        this.lastRequestRtt = lastRequestRtt;
    }

    public long getAverageRequestRtt() {
        return averageRequestRtt;
    }

    public void setAverageRequestRtt(long averageRequestRtt) {
        this.averageRequestRtt = averageRequestRtt;
    }

    public long getLastResponseRtt() {
        return lastResponseRtt;
    }

    public void setLastResponseRtt(long lastResponseRtt) {
        this.lastResponseRtt = lastResponseRtt;
    }

    public long getAverageResponseRtt() {
        return averageResponseRtt;
    }

    public void setAverageResponseRtt(long averageResponseRtt) {
        this.averageResponseRtt = averageResponseRtt;
    }

    public short getQuality() {
        return quality;
    }

    public void setQuality(short quality) {
        this.quality = quality;
    }

    public short[] getLastReceivedMessage() {
        return lastReceivedMessage;
    }

    public List<CommandClassData> getCcData() {
        return ccData;
    }
}
