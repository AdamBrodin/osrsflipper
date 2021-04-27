package com.adambrodin.osrsflipper.models;

import java.util.List;

public class TradingInfo {
    public int totalUptimeSeconds, totalProfitGp;
    public List<ActiveFlip> activeFlips;
    public List<BuyingLimit> usedBuyingLimits;

    public TradingInfo(List<ActiveFlip> activeFlips, List<BuyingLimit> usedBuyingLimits, int totalUptimeSeconds, int totalProfitGp) {
        this.activeFlips = activeFlips;
        this.usedBuyingLimits = usedBuyingLimits;
        this.totalUptimeSeconds = totalUptimeSeconds;
        this.totalProfitGp = totalProfitGp;
    }
}
