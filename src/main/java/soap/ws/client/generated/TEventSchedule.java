
package soap.ws.client.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for TEventSchedule complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TEventSchedule"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ScheduleType" type="{http://tempuri.org/}TScheduleEventFrequencyType"/&gt;
 *         &lt;element name="UserId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Created" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="NextRun" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="EventType" type="{http://tempuri.org/}TScheduledEventType"/&gt;
 *         &lt;element name="RemoveEventAfterLastRun" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="FirstExecutionDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="LastExecutionDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="Command" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="TimeInterval" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="TimeDay" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="DailyDaysBetween" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="WeeksBetween" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="WeeklyMonday" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="WeeklyTuesday" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="WeeklyWednesday" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="WeeklyThursday" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="WeeklyFriday" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="WeeklySaturday" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="WeeklySunday" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="MonthlyDayOfMonth" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="MonthlyJanuary" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="MonthlyFebruary" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="MonthlyMarch" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="MonthlyApril" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="MonthlyMay" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="MonthlyJune" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="MonthlyJuly" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="MonthlyAugust" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="MonthlySpetember" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="MonthlyOctober" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="MonthlyNovember" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="MonthlyDecember" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TEventSchedule", propOrder = {
    "scheduleType",
    "userId",
    "created",
    "nextRun",
    "eventType",
    "removeEventAfterLastRun",
    "firstExecutionDateTime",
    "lastExecutionDateTime",
    "command",
    "timeInterval",
    "timeDay",
    "dailyDaysBetween",
    "weeksBetween",
    "weeklyMonday",
    "weeklyTuesday",
    "weeklyWednesday",
    "weeklyThursday",
    "weeklyFriday",
    "weeklySaturday",
    "weeklySunday",
    "monthlyDayOfMonth",
    "monthlyJanuary",
    "monthlyFebruary",
    "monthlyMarch",
    "monthlyApril",
    "monthlyMay",
    "monthlyJune",
    "monthlyJuly",
    "monthlyAugust",
    "monthlySpetember",
    "monthlyOctober",
    "monthlyNovember",
    "monthlyDecember"
})
public class TEventSchedule {

    @XmlElement(name = "ScheduleType", required = true)
    @XmlSchemaType(name = "string")
    protected TScheduleEventFrequencyType scheduleType;
    @XmlElement(name = "UserId", required = true)
    protected String userId;
    @XmlElement(name = "Created", required = true)
    protected String created;
    @XmlElement(name = "NextRun", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar nextRun;
    @XmlElement(name = "EventType", required = true)
    @XmlSchemaType(name = "string")
    protected TScheduledEventType eventType;
    @XmlElement(name = "RemoveEventAfterLastRun")
    protected boolean removeEventAfterLastRun;
    @XmlElement(name = "FirstExecutionDateTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar firstExecutionDateTime;
    @XmlElement(name = "LastExecutionDateTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastExecutionDateTime;
    @XmlElement(name = "Command", required = true)
    protected String command;
    @XmlElement(name = "TimeInterval", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar timeInterval;
    @XmlElement(name = "TimeDay", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar timeDay;
    @XmlElement(name = "DailyDaysBetween")
    protected int dailyDaysBetween;
    @XmlElement(name = "WeeksBetween")
    protected int weeksBetween;
    @XmlElement(name = "WeeklyMonday")
    protected boolean weeklyMonday;
    @XmlElement(name = "WeeklyTuesday")
    protected boolean weeklyTuesday;
    @XmlElement(name = "WeeklyWednesday")
    protected boolean weeklyWednesday;
    @XmlElement(name = "WeeklyThursday")
    protected boolean weeklyThursday;
    @XmlElement(name = "WeeklyFriday")
    protected boolean weeklyFriday;
    @XmlElement(name = "WeeklySaturday")
    protected boolean weeklySaturday;
    @XmlElement(name = "WeeklySunday")
    protected boolean weeklySunday;
    @XmlElement(name = "MonthlyDayOfMonth")
    protected boolean monthlyDayOfMonth;
    @XmlElement(name = "MonthlyJanuary")
    protected boolean monthlyJanuary;
    @XmlElement(name = "MonthlyFebruary")
    protected boolean monthlyFebruary;
    @XmlElement(name = "MonthlyMarch")
    protected boolean monthlyMarch;
    @XmlElement(name = "MonthlyApril")
    protected boolean monthlyApril;
    @XmlElement(name = "MonthlyMay")
    protected boolean monthlyMay;
    @XmlElement(name = "MonthlyJune")
    protected boolean monthlyJune;
    @XmlElement(name = "MonthlyJuly")
    protected boolean monthlyJuly;
    @XmlElement(name = "MonthlyAugust")
    protected boolean monthlyAugust;
    @XmlElement(name = "MonthlySpetember")
    protected boolean monthlySpetember;
    @XmlElement(name = "MonthlyOctober")
    protected boolean monthlyOctober;
    @XmlElement(name = "MonthlyNovember")
    protected boolean monthlyNovember;
    @XmlElement(name = "MonthlyDecember")
    protected boolean monthlyDecember;

    /**
     * Gets the value of the scheduleType property.
     * 
     * @return
     *     possible object is
     *     {@link TScheduleEventFrequencyType }
     *     
     */
    public TScheduleEventFrequencyType getScheduleType() {
        return scheduleType;
    }

    /**
     * Sets the value of the scheduleType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TScheduleEventFrequencyType }
     *     
     */
    public void setScheduleType(TScheduleEventFrequencyType value) {
        this.scheduleType = value;
    }

    /**
     * Gets the value of the userId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserId() {
        return userId;
    }

    /**
     * Sets the value of the userId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserId(String value) {
        this.userId = value;
    }

    /**
     * Gets the value of the created property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreated() {
        return created;
    }

    /**
     * Sets the value of the created property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreated(String value) {
        this.created = value;
    }

    /**
     * Gets the value of the nextRun property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getNextRun() {
        return nextRun;
    }

    /**
     * Sets the value of the nextRun property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setNextRun(XMLGregorianCalendar value) {
        this.nextRun = value;
    }

    /**
     * Gets the value of the eventType property.
     * 
     * @return
     *     possible object is
     *     {@link TScheduledEventType }
     *     
     */
    public TScheduledEventType getEventType() {
        return eventType;
    }

    /**
     * Sets the value of the eventType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TScheduledEventType }
     *     
     */
    public void setEventType(TScheduledEventType value) {
        this.eventType = value;
    }

    /**
     * Gets the value of the removeEventAfterLastRun property.
     * 
     */
    public boolean isRemoveEventAfterLastRun() {
        return removeEventAfterLastRun;
    }

    /**
     * Sets the value of the removeEventAfterLastRun property.
     * 
     */
    public void setRemoveEventAfterLastRun(boolean value) {
        this.removeEventAfterLastRun = value;
    }

    /**
     * Gets the value of the firstExecutionDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFirstExecutionDateTime() {
        return firstExecutionDateTime;
    }

    /**
     * Sets the value of the firstExecutionDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFirstExecutionDateTime(XMLGregorianCalendar value) {
        this.firstExecutionDateTime = value;
    }

    /**
     * Gets the value of the lastExecutionDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastExecutionDateTime() {
        return lastExecutionDateTime;
    }

    /**
     * Sets the value of the lastExecutionDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastExecutionDateTime(XMLGregorianCalendar value) {
        this.lastExecutionDateTime = value;
    }

    /**
     * Gets the value of the command property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommand() {
        return command;
    }

    /**
     * Sets the value of the command property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommand(String value) {
        this.command = value;
    }

    /**
     * Gets the value of the timeInterval property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTimeInterval() {
        return timeInterval;
    }

    /**
     * Sets the value of the timeInterval property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTimeInterval(XMLGregorianCalendar value) {
        this.timeInterval = value;
    }

    /**
     * Gets the value of the timeDay property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTimeDay() {
        return timeDay;
    }

    /**
     * Sets the value of the timeDay property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTimeDay(XMLGregorianCalendar value) {
        this.timeDay = value;
    }

    /**
     * Gets the value of the dailyDaysBetween property.
     * 
     */
    public int getDailyDaysBetween() {
        return dailyDaysBetween;
    }

    /**
     * Sets the value of the dailyDaysBetween property.
     * 
     */
    public void setDailyDaysBetween(int value) {
        this.dailyDaysBetween = value;
    }

    /**
     * Gets the value of the weeksBetween property.
     * 
     */
    public int getWeeksBetween() {
        return weeksBetween;
    }

    /**
     * Sets the value of the weeksBetween property.
     * 
     */
    public void setWeeksBetween(int value) {
        this.weeksBetween = value;
    }

    /**
     * Gets the value of the weeklyMonday property.
     * 
     */
    public boolean isWeeklyMonday() {
        return weeklyMonday;
    }

    /**
     * Sets the value of the weeklyMonday property.
     * 
     */
    public void setWeeklyMonday(boolean value) {
        this.weeklyMonday = value;
    }

    /**
     * Gets the value of the weeklyTuesday property.
     * 
     */
    public boolean isWeeklyTuesday() {
        return weeklyTuesday;
    }

    /**
     * Sets the value of the weeklyTuesday property.
     * 
     */
    public void setWeeklyTuesday(boolean value) {
        this.weeklyTuesday = value;
    }

    /**
     * Gets the value of the weeklyWednesday property.
     * 
     */
    public boolean isWeeklyWednesday() {
        return weeklyWednesday;
    }

    /**
     * Sets the value of the weeklyWednesday property.
     * 
     */
    public void setWeeklyWednesday(boolean value) {
        this.weeklyWednesday = value;
    }

    /**
     * Gets the value of the weeklyThursday property.
     * 
     */
    public boolean isWeeklyThursday() {
        return weeklyThursday;
    }

    /**
     * Sets the value of the weeklyThursday property.
     * 
     */
    public void setWeeklyThursday(boolean value) {
        this.weeklyThursday = value;
    }

    /**
     * Gets the value of the weeklyFriday property.
     * 
     */
    public boolean isWeeklyFriday() {
        return weeklyFriday;
    }

    /**
     * Sets the value of the weeklyFriday property.
     * 
     */
    public void setWeeklyFriday(boolean value) {
        this.weeklyFriday = value;
    }

    /**
     * Gets the value of the weeklySaturday property.
     * 
     */
    public boolean isWeeklySaturday() {
        return weeklySaturday;
    }

    /**
     * Sets the value of the weeklySaturday property.
     * 
     */
    public void setWeeklySaturday(boolean value) {
        this.weeklySaturday = value;
    }

    /**
     * Gets the value of the weeklySunday property.
     * 
     */
    public boolean isWeeklySunday() {
        return weeklySunday;
    }

    /**
     * Sets the value of the weeklySunday property.
     * 
     */
    public void setWeeklySunday(boolean value) {
        this.weeklySunday = value;
    }

    /**
     * Gets the value of the monthlyDayOfMonth property.
     * 
     */
    public boolean isMonthlyDayOfMonth() {
        return monthlyDayOfMonth;
    }

    /**
     * Sets the value of the monthlyDayOfMonth property.
     * 
     */
    public void setMonthlyDayOfMonth(boolean value) {
        this.monthlyDayOfMonth = value;
    }

    /**
     * Gets the value of the monthlyJanuary property.
     * 
     */
    public boolean isMonthlyJanuary() {
        return monthlyJanuary;
    }

    /**
     * Sets the value of the monthlyJanuary property.
     * 
     */
    public void setMonthlyJanuary(boolean value) {
        this.monthlyJanuary = value;
    }

    /**
     * Gets the value of the monthlyFebruary property.
     * 
     */
    public boolean isMonthlyFebruary() {
        return monthlyFebruary;
    }

    /**
     * Sets the value of the monthlyFebruary property.
     * 
     */
    public void setMonthlyFebruary(boolean value) {
        this.monthlyFebruary = value;
    }

    /**
     * Gets the value of the monthlyMarch property.
     * 
     */
    public boolean isMonthlyMarch() {
        return monthlyMarch;
    }

    /**
     * Sets the value of the monthlyMarch property.
     * 
     */
    public void setMonthlyMarch(boolean value) {
        this.monthlyMarch = value;
    }

    /**
     * Gets the value of the monthlyApril property.
     * 
     */
    public boolean isMonthlyApril() {
        return monthlyApril;
    }

    /**
     * Sets the value of the monthlyApril property.
     * 
     */
    public void setMonthlyApril(boolean value) {
        this.monthlyApril = value;
    }

    /**
     * Gets the value of the monthlyMay property.
     * 
     */
    public boolean isMonthlyMay() {
        return monthlyMay;
    }

    /**
     * Sets the value of the monthlyMay property.
     * 
     */
    public void setMonthlyMay(boolean value) {
        this.monthlyMay = value;
    }

    /**
     * Gets the value of the monthlyJune property.
     * 
     */
    public boolean isMonthlyJune() {
        return monthlyJune;
    }

    /**
     * Sets the value of the monthlyJune property.
     * 
     */
    public void setMonthlyJune(boolean value) {
        this.monthlyJune = value;
    }

    /**
     * Gets the value of the monthlyJuly property.
     * 
     */
    public boolean isMonthlyJuly() {
        return monthlyJuly;
    }

    /**
     * Sets the value of the monthlyJuly property.
     * 
     */
    public void setMonthlyJuly(boolean value) {
        this.monthlyJuly = value;
    }

    /**
     * Gets the value of the monthlyAugust property.
     * 
     */
    public boolean isMonthlyAugust() {
        return monthlyAugust;
    }

    /**
     * Sets the value of the monthlyAugust property.
     * 
     */
    public void setMonthlyAugust(boolean value) {
        this.monthlyAugust = value;
    }

    /**
     * Gets the value of the monthlySpetember property.
     * 
     */
    public boolean isMonthlySpetember() {
        return monthlySpetember;
    }

    /**
     * Sets the value of the monthlySpetember property.
     * 
     */
    public void setMonthlySpetember(boolean value) {
        this.monthlySpetember = value;
    }

    /**
     * Gets the value of the monthlyOctober property.
     * 
     */
    public boolean isMonthlyOctober() {
        return monthlyOctober;
    }

    /**
     * Sets the value of the monthlyOctober property.
     * 
     */
    public void setMonthlyOctober(boolean value) {
        this.monthlyOctober = value;
    }

    /**
     * Gets the value of the monthlyNovember property.
     * 
     */
    public boolean isMonthlyNovember() {
        return monthlyNovember;
    }

    /**
     * Sets the value of the monthlyNovember property.
     * 
     */
    public void setMonthlyNovember(boolean value) {
        this.monthlyNovember = value;
    }

    /**
     * Gets the value of the monthlyDecember property.
     * 
     */
    public boolean isMonthlyDecember() {
        return monthlyDecember;
    }

    /**
     * Sets the value of the monthlyDecember property.
     * 
     */
    public void setMonthlyDecember(boolean value) {
        this.monthlyDecember = value;
    }

}
