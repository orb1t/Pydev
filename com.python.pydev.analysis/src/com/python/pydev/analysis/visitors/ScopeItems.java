/*
 * Created on 27/07/2005
 */
package com.python.pydev.analysis.visitors;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class ScopeItems {
    Map<String,Found> m = new HashMap<String,Found>();
    int ifSubScope = 0;
    private int scopeId;

    public ScopeItems(int scopeId) {
        this.scopeId = scopeId;
    }

    public Found get(String rep) {
        return m.get(rep);
    }

    public void put(String rep, Found found) {
        m.put(rep, found);
    }

    public Collection<Found> values() {
        return m.values();
    }

    public void addIfSubScope() {
        ifSubScope++;
    }

    public void removeIfSubScope() {
        ifSubScope--;
    }

    public int getIfSubScope() {
        return ifSubScope;
    }

    /**
     * @return Returns the scopeId.
     */
    public int getScopeId() {
        return scopeId;
    }

}
