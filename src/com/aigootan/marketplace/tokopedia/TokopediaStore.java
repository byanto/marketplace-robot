package com.aigootan.marketplace.tokopedia;

import com.aigootan.marketplace.model.Owner;
import com.aigootan.marketplace.model.Store;

public class TokopediaStore extends Store {

    protected TokopediaStore(final Owner owner, final String id, final String name, final String url, 
            final long totalTransaction, final long totalSoldProduct, final int totalEtalase, final int totalProduct, 
            final String sendFrom, final String sendDuration, final String lastOnline, 
            final String openSince, final String reputationPoints, final String favoriteShops) {
        super(owner, id, name, url, totalTransaction, totalSoldProduct, totalEtalase, totalProduct, sendFrom, sendDuration,
                lastOnline, openSince);
        m_reputationPoints = reputationPoints;
        m_favoriteShops = favoriteShops;
    }

    private boolean m_isGoleMerchant = true;
    private String m_reputationPoints;
    private String m_favoriteShops;
    
}
