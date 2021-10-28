
package soap.ws.client.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TClientSettings complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TClientSettings"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="General_AutomaticallyReconnect" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="SubnetBrowser_Restore" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="SubnetBrowser_VerticalLines" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="SubnetBrowser_HorizontalLines" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="SubnetBrowser_ColumnHeaders" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="SubnetBrowser_ItemIds" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="SubnetBrowser_FullRowSelect" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="SubnetBrowser_TreeLines" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="Grid_Restore" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="Grid_TableAdjustRowHeights" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="Grid_TableDisplayFilter" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="Grid_TableExpandGroups" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="Grid_TableShowGroupBox" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="Grid_CardExpand" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="Grid_CardAdjustHeights" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="Grid_CardHideEmptyRows" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="Grid_CardAdjustWidths" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="Grid_DisplayAllChildSubnetLevel" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="ExternalTools_Settings" type="{http://tempuri.org/}TExternalTools"/&gt;
 *         &lt;element name="Grid_EnableSubnetPaging" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="Grid_SubnetPageSize" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Grid_EnableIPAddressPaging" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="Grid_IPAddressPageSize" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Connection_AutoReconnect" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TClientSettings", propOrder = {
    "generalAutomaticallyReconnect",
    "subnetBrowserRestore",
    "subnetBrowserVerticalLines",
    "subnetBrowserHorizontalLines",
    "subnetBrowserColumnHeaders",
    "subnetBrowserItemIds",
    "subnetBrowserFullRowSelect",
    "subnetBrowserTreeLines",
    "gridRestore",
    "gridTableAdjustRowHeights",
    "gridTableDisplayFilter",
    "gridTableExpandGroups",
    "gridTableShowGroupBox",
    "gridCardExpand",
    "gridCardAdjustHeights",
    "gridCardHideEmptyRows",
    "gridCardAdjustWidths",
    "gridDisplayAllChildSubnetLevel",
    "externalToolsSettings",
    "gridEnableSubnetPaging",
    "gridSubnetPageSize",
    "gridEnableIPAddressPaging",
    "gridIPAddressPageSize",
    "connectionAutoReconnect"
})
public class TClientSettings {

    @XmlElement(name = "General_AutomaticallyReconnect")
    protected boolean generalAutomaticallyReconnect;
    @XmlElement(name = "SubnetBrowser_Restore")
    protected boolean subnetBrowserRestore;
    @XmlElement(name = "SubnetBrowser_VerticalLines")
    protected boolean subnetBrowserVerticalLines;
    @XmlElement(name = "SubnetBrowser_HorizontalLines")
    protected boolean subnetBrowserHorizontalLines;
    @XmlElement(name = "SubnetBrowser_ColumnHeaders")
    protected boolean subnetBrowserColumnHeaders;
    @XmlElement(name = "SubnetBrowser_ItemIds")
    protected boolean subnetBrowserItemIds;
    @XmlElement(name = "SubnetBrowser_FullRowSelect")
    protected boolean subnetBrowserFullRowSelect;
    @XmlElement(name = "SubnetBrowser_TreeLines")
    protected boolean subnetBrowserTreeLines;
    @XmlElement(name = "Grid_Restore")
    protected boolean gridRestore;
    @XmlElement(name = "Grid_TableAdjustRowHeights")
    protected boolean gridTableAdjustRowHeights;
    @XmlElement(name = "Grid_TableDisplayFilter")
    protected boolean gridTableDisplayFilter;
    @XmlElement(name = "Grid_TableExpandGroups")
    protected boolean gridTableExpandGroups;
    @XmlElement(name = "Grid_TableShowGroupBox")
    protected boolean gridTableShowGroupBox;
    @XmlElement(name = "Grid_CardExpand")
    protected boolean gridCardExpand;
    @XmlElement(name = "Grid_CardAdjustHeights")
    protected boolean gridCardAdjustHeights;
    @XmlElement(name = "Grid_CardHideEmptyRows")
    protected boolean gridCardHideEmptyRows;
    @XmlElement(name = "Grid_CardAdjustWidths")
    protected boolean gridCardAdjustWidths;
    @XmlElement(name = "Grid_DisplayAllChildSubnetLevel")
    protected boolean gridDisplayAllChildSubnetLevel;
    @XmlElement(name = "ExternalTools_Settings", required = true)
    protected TExternalTools externalToolsSettings;
    @XmlElement(name = "Grid_EnableSubnetPaging")
    protected boolean gridEnableSubnetPaging;
    @XmlElement(name = "Grid_SubnetPageSize")
    protected int gridSubnetPageSize;
    @XmlElement(name = "Grid_EnableIPAddressPaging")
    protected boolean gridEnableIPAddressPaging;
    @XmlElement(name = "Grid_IPAddressPageSize")
    protected int gridIPAddressPageSize;
    @XmlElement(name = "Connection_AutoReconnect")
    protected boolean connectionAutoReconnect;

    /**
     * Gets the value of the generalAutomaticallyReconnect property.
     * 
     */
    public boolean isGeneralAutomaticallyReconnect() {
        return generalAutomaticallyReconnect;
    }

    /**
     * Sets the value of the generalAutomaticallyReconnect property.
     * 
     */
    public void setGeneralAutomaticallyReconnect(boolean value) {
        this.generalAutomaticallyReconnect = value;
    }

    /**
     * Gets the value of the subnetBrowserRestore property.
     * 
     */
    public boolean isSubnetBrowserRestore() {
        return subnetBrowserRestore;
    }

    /**
     * Sets the value of the subnetBrowserRestore property.
     * 
     */
    public void setSubnetBrowserRestore(boolean value) {
        this.subnetBrowserRestore = value;
    }

    /**
     * Gets the value of the subnetBrowserVerticalLines property.
     * 
     */
    public boolean isSubnetBrowserVerticalLines() {
        return subnetBrowserVerticalLines;
    }

    /**
     * Sets the value of the subnetBrowserVerticalLines property.
     * 
     */
    public void setSubnetBrowserVerticalLines(boolean value) {
        this.subnetBrowserVerticalLines = value;
    }

    /**
     * Gets the value of the subnetBrowserHorizontalLines property.
     * 
     */
    public boolean isSubnetBrowserHorizontalLines() {
        return subnetBrowserHorizontalLines;
    }

    /**
     * Sets the value of the subnetBrowserHorizontalLines property.
     * 
     */
    public void setSubnetBrowserHorizontalLines(boolean value) {
        this.subnetBrowserHorizontalLines = value;
    }

    /**
     * Gets the value of the subnetBrowserColumnHeaders property.
     * 
     */
    public boolean isSubnetBrowserColumnHeaders() {
        return subnetBrowserColumnHeaders;
    }

    /**
     * Sets the value of the subnetBrowserColumnHeaders property.
     * 
     */
    public void setSubnetBrowserColumnHeaders(boolean value) {
        this.subnetBrowserColumnHeaders = value;
    }

    /**
     * Gets the value of the subnetBrowserItemIds property.
     * 
     */
    public boolean isSubnetBrowserItemIds() {
        return subnetBrowserItemIds;
    }

    /**
     * Sets the value of the subnetBrowserItemIds property.
     * 
     */
    public void setSubnetBrowserItemIds(boolean value) {
        this.subnetBrowserItemIds = value;
    }

    /**
     * Gets the value of the subnetBrowserFullRowSelect property.
     * 
     */
    public boolean isSubnetBrowserFullRowSelect() {
        return subnetBrowserFullRowSelect;
    }

    /**
     * Sets the value of the subnetBrowserFullRowSelect property.
     * 
     */
    public void setSubnetBrowserFullRowSelect(boolean value) {
        this.subnetBrowserFullRowSelect = value;
    }

    /**
     * Gets the value of the subnetBrowserTreeLines property.
     * 
     */
    public boolean isSubnetBrowserTreeLines() {
        return subnetBrowserTreeLines;
    }

    /**
     * Sets the value of the subnetBrowserTreeLines property.
     * 
     */
    public void setSubnetBrowserTreeLines(boolean value) {
        this.subnetBrowserTreeLines = value;
    }

    /**
     * Gets the value of the gridRestore property.
     * 
     */
    public boolean isGridRestore() {
        return gridRestore;
    }

    /**
     * Sets the value of the gridRestore property.
     * 
     */
    public void setGridRestore(boolean value) {
        this.gridRestore = value;
    }

    /**
     * Gets the value of the gridTableAdjustRowHeights property.
     * 
     */
    public boolean isGridTableAdjustRowHeights() {
        return gridTableAdjustRowHeights;
    }

    /**
     * Sets the value of the gridTableAdjustRowHeights property.
     * 
     */
    public void setGridTableAdjustRowHeights(boolean value) {
        this.gridTableAdjustRowHeights = value;
    }

    /**
     * Gets the value of the gridTableDisplayFilter property.
     * 
     */
    public boolean isGridTableDisplayFilter() {
        return gridTableDisplayFilter;
    }

    /**
     * Sets the value of the gridTableDisplayFilter property.
     * 
     */
    public void setGridTableDisplayFilter(boolean value) {
        this.gridTableDisplayFilter = value;
    }

    /**
     * Gets the value of the gridTableExpandGroups property.
     * 
     */
    public boolean isGridTableExpandGroups() {
        return gridTableExpandGroups;
    }

    /**
     * Sets the value of the gridTableExpandGroups property.
     * 
     */
    public void setGridTableExpandGroups(boolean value) {
        this.gridTableExpandGroups = value;
    }

    /**
     * Gets the value of the gridTableShowGroupBox property.
     * 
     */
    public boolean isGridTableShowGroupBox() {
        return gridTableShowGroupBox;
    }

    /**
     * Sets the value of the gridTableShowGroupBox property.
     * 
     */
    public void setGridTableShowGroupBox(boolean value) {
        this.gridTableShowGroupBox = value;
    }

    /**
     * Gets the value of the gridCardExpand property.
     * 
     */
    public boolean isGridCardExpand() {
        return gridCardExpand;
    }

    /**
     * Sets the value of the gridCardExpand property.
     * 
     */
    public void setGridCardExpand(boolean value) {
        this.gridCardExpand = value;
    }

    /**
     * Gets the value of the gridCardAdjustHeights property.
     * 
     */
    public boolean isGridCardAdjustHeights() {
        return gridCardAdjustHeights;
    }

    /**
     * Sets the value of the gridCardAdjustHeights property.
     * 
     */
    public void setGridCardAdjustHeights(boolean value) {
        this.gridCardAdjustHeights = value;
    }

    /**
     * Gets the value of the gridCardHideEmptyRows property.
     * 
     */
    public boolean isGridCardHideEmptyRows() {
        return gridCardHideEmptyRows;
    }

    /**
     * Sets the value of the gridCardHideEmptyRows property.
     * 
     */
    public void setGridCardHideEmptyRows(boolean value) {
        this.gridCardHideEmptyRows = value;
    }

    /**
     * Gets the value of the gridCardAdjustWidths property.
     * 
     */
    public boolean isGridCardAdjustWidths() {
        return gridCardAdjustWidths;
    }

    /**
     * Sets the value of the gridCardAdjustWidths property.
     * 
     */
    public void setGridCardAdjustWidths(boolean value) {
        this.gridCardAdjustWidths = value;
    }

    /**
     * Gets the value of the gridDisplayAllChildSubnetLevel property.
     * 
     */
    public boolean isGridDisplayAllChildSubnetLevel() {
        return gridDisplayAllChildSubnetLevel;
    }

    /**
     * Sets the value of the gridDisplayAllChildSubnetLevel property.
     * 
     */
    public void setGridDisplayAllChildSubnetLevel(boolean value) {
        this.gridDisplayAllChildSubnetLevel = value;
    }

    /**
     * Gets the value of the externalToolsSettings property.
     * 
     * @return
     *     possible object is
     *     {@link TExternalTools }
     *     
     */
    public TExternalTools getExternalToolsSettings() {
        return externalToolsSettings;
    }

    /**
     * Sets the value of the externalToolsSettings property.
     * 
     * @param value
     *     allowed object is
     *     {@link TExternalTools }
     *     
     */
    public void setExternalToolsSettings(TExternalTools value) {
        this.externalToolsSettings = value;
    }

    /**
     * Gets the value of the gridEnableSubnetPaging property.
     * 
     */
    public boolean isGridEnableSubnetPaging() {
        return gridEnableSubnetPaging;
    }

    /**
     * Sets the value of the gridEnableSubnetPaging property.
     * 
     */
    public void setGridEnableSubnetPaging(boolean value) {
        this.gridEnableSubnetPaging = value;
    }

    /**
     * Gets the value of the gridSubnetPageSize property.
     * 
     */
    public int getGridSubnetPageSize() {
        return gridSubnetPageSize;
    }

    /**
     * Sets the value of the gridSubnetPageSize property.
     * 
     */
    public void setGridSubnetPageSize(int value) {
        this.gridSubnetPageSize = value;
    }

    /**
     * Gets the value of the gridEnableIPAddressPaging property.
     * 
     */
    public boolean isGridEnableIPAddressPaging() {
        return gridEnableIPAddressPaging;
    }

    /**
     * Sets the value of the gridEnableIPAddressPaging property.
     * 
     */
    public void setGridEnableIPAddressPaging(boolean value) {
        this.gridEnableIPAddressPaging = value;
    }

    /**
     * Gets the value of the gridIPAddressPageSize property.
     * 
     */
    public int getGridIPAddressPageSize() {
        return gridIPAddressPageSize;
    }

    /**
     * Sets the value of the gridIPAddressPageSize property.
     * 
     */
    public void setGridIPAddressPageSize(int value) {
        this.gridIPAddressPageSize = value;
    }

    /**
     * Gets the value of the connectionAutoReconnect property.
     * 
     */
    public boolean isConnectionAutoReconnect() {
        return connectionAutoReconnect;
    }

    /**
     * Sets the value of the connectionAutoReconnect property.
     * 
     */
    public void setConnectionAutoReconnect(boolean value) {
        this.connectionAutoReconnect = value;
    }

}
