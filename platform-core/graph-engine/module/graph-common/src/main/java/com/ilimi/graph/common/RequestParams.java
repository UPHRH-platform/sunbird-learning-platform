package com.ilimi.graph.common;

import java.io.Serializable;

/**
 * 
 * @author rayulu
 * 
 */
public class RequestParams implements Serializable {

    private static final long serialVersionUID = -759588115950763188L;

    private String did;
    private String key;
    private String msgid;

    public String getDid() {
        return did;
    }

    public void setDid(String did) {
        this.did = did;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getMsgid() {
        return msgid;
    }

    public void setMsgid(String msgid) {
        this.msgid = msgid;
    }
}
