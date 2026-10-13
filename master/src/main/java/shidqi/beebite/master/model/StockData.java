package shidqi.beebite.master.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

import java.time.LocalDate;

@Entity(name = "stockData")
public class StockData {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Integer id;
   private String tickerCode;
   private LocalDate tradeDate;
   private Float prev;
   private Float high;
   private Float low;
   private Float close;
   private Float change;
   private Double volume;
   private Float value;
   private Integer frequency;
   private Float index;
   private Integer offer;
   private String tradeCondition;
   private Integer OfferVolume;
   private Integer bid;
   private String bidCondition;
   private Integer bidVolume;

   public StockData() {
   }

   public StockData(Integer id, String tickerCode, LocalDate tradeDate, Float prev, Float high, Float low, Float close, Float change, Double volume, Float value, Integer frequency, Float index, Integer offer, String tradeCondition, Integer offerVolume, Integer bid, String bidCondition, Integer bidVolume) {
      this.id = id;
      this.tickerCode = tickerCode;
      this.tradeDate = tradeDate;
      this.prev = prev;
      this.high = high;
      this.low = low;
      this.close = close;
      this.change = change;
      this.volume = volume;
      this.value = value;
      this.frequency = frequency;
      this.index = index;
      this.offer = offer;
      this.tradeCondition = tradeCondition;
      OfferVolume = offerVolume;
      this.bid = bid;
      this.bidCondition = bidCondition;
      this.bidVolume = bidVolume;
   }

   public Integer getId() {
      return id;
   }

   public void setId(Integer id) {
      this.id = id;
   }

   public String getTickerCode() {
      return tickerCode;
   }

   public void setTickerCode(String tickerCode) {
      this.tickerCode = tickerCode;
   }

   public LocalDate getTradeDate() {
      return tradeDate;
   }

   public void setTradeDate(LocalDate tradeDate) {
      this.tradeDate = tradeDate;
   }

   public Float getPrev() {
      return prev;
   }

   public void setPrev(Float prev) {
      this.prev = prev;
   }

   public Float getHigh() {
      return high;
   }

   public void setHigh(Float high) {
      this.high = high;
   }

   public Float getLow() {
      return low;
   }

   public void setLow(Float low) {
      this.low = low;
   }

   public Float getClose() {
      return close;
   }

   public void setClose(Float close) {
      this.close = close;
   }

   public Float getChange() {
      return change;
   }

   public void setChange(Float change) {
      this.change = change;
   }

   public Double getVolume() {
      return volume;
   }

   public void setVolume(Double volume) {
      this.volume = volume;
   }

   public Float getValue() {
      return value;
   }

   public void setValue(Float value) {
      this.value = value;
   }

   public Integer getFrequency() {
      return frequency;
   }

   public void setFrequency(Integer frequency) {
      this.frequency = frequency;
   }

   public Float getIndex() {
      return index;
   }

   public void setIndex(Float index) {
      this.index = index;
   }

   public Integer getOffer() {
      return offer;
   }

   public void setOffer(Integer offer) {
      this.offer = offer;
   }

   public String getTradeCondition() {
      return tradeCondition;
   }

   public void setTradeCondition(String tradeCondition) {
      this.tradeCondition = tradeCondition;
   }

   public Integer getOfferVolume() {
      return OfferVolume;
   }

   public void setOfferVolume(Integer offerVolume) {
      OfferVolume = offerVolume;
   }

   public Integer getBid() {
      return bid;
   }

   public void setBid(Integer bid) {
      this.bid = bid;
   }

   public String getBidCondition() {
      return bidCondition;
   }

   public void setBidCondition(String bidCondition) {
      this.bidCondition = bidCondition;
   }

   public Integer getBidVolume() {
      return bidVolume;
   }

   public void setBidVolume(Integer bidVolume) {
      this.bidVolume = bidVolume;
   }
}
