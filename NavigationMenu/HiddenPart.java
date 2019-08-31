package zavrsniRad.NavigationMenu;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HiddenPart {

	static WebDriver driver;
	
	public HiddenPart(WebDriver driver) {
		this.driver = driver;
	}
	
	// Elements
	
	private static WebElement wbMachineLogo() {
		return driver.findElement(By.xpath("//*[@id=\"nav-tophat\"]/div[1]/div/div[2]/div/div[1]/a"));
	}
	private static WebElement webPagesLink() {
		return driver.findElement(By.xpath("//*[@id=\"nav-tophat\"]/div[1]/div/div[1]/a"));
	}
	private static WebElement wbmSearchBox() {
		return driver.findElement(By.cssSelector("#nav-wb-url"));
	}
	private static WebElement bTBorrowImg() {
		return driver.findElement(By.cssSelector("div.row.toprow.fivecolumns.texts div.col-sm-2.col-xs-5.col-sm-pull-2"));
	}
	private static WebElement bTBorrowLink() {
		return driver.findElement(By.xpath("//*[@id=\"nav-tophat\"]/div[2]/div[2]/div/center/a"));
	}
	private static WebElement openLibraryImg() {
		return driver.findElement(By.cssSelector("div.row.toprow.fivecolumns.texts div.col-sm-2.col-xs-5.col-sm-pull-4"));
	}
	private static WebElement openLibraryLink() {
		return driver.findElement(By.xpath("//*[@id=\"nav-tophat\"]/div[2]/div[4]/div/center/a"));
	}
	private static List<WebElement> featuredListTexts(){
		return driver.findElements(By.cssSelector("div.col-sm-2.col-xs-7.col-sm-push-4 a"));
	}
	private static List<WebElement> topListTexts(){
		return driver.findElements(By.cssSelector("div.row.toprow.fivecolumns.texts div.col-sm-2 col-xs-7 col-sm-push-2"));
	}
	private static List<WebElement> otherListTexts(){
		return driver.findElements(By.cssSelector("div.row.toprow.fivecolumns.texts div.col-sm-2 col-xs-7"));
	}
	private static WebElement tvNewsImg() {
		return driver.findElement(By.cssSelector("div.row.toprow.fivecolumns.movies div.col-sm-2.col-xs-5.col-sm-pull-2"));
	}
	private static WebElement tvNewsLink() {
		return driver.findElement(By.xpath("//*[@id=\"nav-tophat\"]/div[3]/div[2]/div/center/a"));
	}
	private static WebElement understanding911Img() {
		return driver.findElement(By.cssSelector("div.row.toprow.fivecolumns.movies div.col-sm-2.col-xs-5.col-sm-pull-4"));
	}
	private static WebElement understanding911Link() {
		return driver.findElement(By.xpath("//*[@id=\"nav-tophat\"]/div[3]/div[4]/div/center/a"));
	}
	private static List<WebElement> featuredListVideo(){
		return driver.findElements(By.cssSelector("div.toprow:nth-child(3) div:nth-child(1) div:nth-child(1) a"));
	}
	private static List<WebElement> topListVideo(){
		return driver.findElements(By.cssSelector("div.row.toprow.fivecolumns.movies div.col-sm-2 col-xs-7 col-sm-push-2"));
	}
	private static List<WebElement> otherListVideo(){
		return driver.findElements(By.cssSelector("div.row.toprow.fivecolumns.movies div.col-sm-2 col-xs-7"));
	}
	private static WebElement liveMusicArchiveImg() {
		return driver.findElement(By.cssSelector("div.row.toprow.fivecolumns.audio div.col-sm-2.col-xs-5.col-sm-pull-2"));
	}
	private static WebElement liveMusicArchiveLink() {
		return driver.findElement(By.xpath("//*[@id=\"nav-tophat\"]/div[4]/div[2]/div/center/a"));
	}
	private static WebElement librivoxFreeAudiobookImg() {
		return driver.findElement(By.cssSelector("div.row.toprow.fivecolumns.audio div.col-sm-2.col-xs-5.col-sm-pull-4"));
	}
	private static WebElement librivoxFreeAudiobookLink() {
		return driver.findElement(By.xpath("//*[@id=\"nav-tophat\"]/div[4]/div[4]/div/center/a"));
	}
	private static List<WebElement> featuredListAudio(){
		return driver.findElements(By.cssSelector("div.row.toprow.fivecolumns.audio div.col-sm-2.col-xs-7.col-sm-push-4"));
	}
	private static List<WebElement> topListAudio(){
		return driver.findElements(By.cssSelector("div.row.toprow.fivecolumns.audio div.col-sm-2.col-xs-7.col-sm-push-2"));
	}
	private static List<WebElement> otherListAudio(){
		return driver.findElements(By.cssSelector("div.row.toprow.fivecolumns.audio div:nth-child(5)"));
	}
	private static WebElement internetArcadeImg() {
		return driver.findElement(By.cssSelector("div.row.toprow.fivecolumns.software div.col-sm-2.col-xs-5.col-sm-pull-2"));
	}
	private static WebElement internetArcadeLink() {
		return driver.findElement(By.xpath("//*[@id=\"nav-tophat\"]/div[5]/div[2]/div/center/a"));
	}
	private static WebElement consoleLivingRoomImg() {
		return driver.findElement(By.cssSelector("div.row.toprow.fivecolumns.software div.col-sm-2.col-xs-5.col-sm-pull-4"));
	}
	private static WebElement consoleLivingRoomLink() {
		return driver.findElement(By.xpath("//*[@id=\"nav-tophat\"]/div[5]/div[4]/div/center/a"));
	}
	private static List<WebElement> featuredListSoftware(){
		return driver.findElements(By.cssSelector("div.row.toprow.fivecolumns.software div.col-sm-2.col-xs-7.col-sm-push-4"));
	}
	private static List<WebElement> topListSoftware(){
		return driver.findElements(By.cssSelector("div.row.toprow.fivecolumns.software div.col-sm-2.col-xs-7.col-sm-push-2"));
	}
	private static List<WebElement> otherListSoftware(){
		return driver.findElements(By.cssSelector("div.row.toprow.fivecolumns.software div:nth-child(5)"));
	}
	private static WebElement metropolitanMuseumImg() {
		return driver.findElement(By.cssSelector("div.row.toprow.fivecolumns.image div.col-sm-2.col-xs-5.col-sm-pull-2"));
	}
	private static WebElement metropolitanMuseumLink() {
		return driver.findElement(By.xpath("//*[@id=\"nav-tophat\"]/div[6]/div[2]/div/center/a"));
	}
	private static WebElement brooklynMuseumImg() {
		return driver.findElement(By.cssSelector("div.row.toprow.fivecolumns.image div.col-sm-2.col-xs-5.col-sm-pull-4"));
	}
	private static WebElement brooklynMuseumLink() {
		return driver.findElement(By.xpath("//*[@id=\"nav-tophat\"]/div[6]/div[4]/div/center/a"));
	}
	private static List<WebElement> featuredListImage(){
		return driver.findElements(By.cssSelector("div.row.toprow.fivecolumns.image div.col-sm-2.col-xs-7.col-sm-push-4"));
	}
	private static List<WebElement> topListImage(){
		return driver.findElements(By.cssSelector("div.row.toprow.fivecolumns.image div.col-sm-2.col-xs-7.col-sm-push-2"));
	}
	
	// Actions
	
	public void clickWBMachineLogo() {
		wbMachineLogo().click();
	}
	public void clickWebPagesLink() {
		webPagesLink().click();
	}
	public void clickWBMSearchBox() {
		wbmSearchBox().click();
	}
	public void sendTextToWBMSearchBox(String searchTerm) {
		wbmSearchBox().sendKeys(searchTerm, Keys.ENTER);
	}
	public void clickBTBorrowImg() {
		bTBorrowImg().click();
	}
	public void clickBTBorrowLink() {
		bTBorrowLink().click();
	}
	public void clickOpenLibraryImg() {
		openLibraryImg().click();
	}
	public void clickOpenLibraryLink() {
		openLibraryLink().click();
	}
	public List<WebElement> getFeaturedListTexts() {
		return featuredListTexts();
	}
	public void clickFeaturedListTexts(Integer i) {
		featuredListTexts().get(i).click();
	}

	public List<WebElement> getTopListTexts(){
		return topListTexts();
	}
	public List<WebElement> getOtherListTexts(){
		return otherListTexts();
	}
	public void clickTvNewsImg() {
		tvNewsImg().click();
	}
	public void clickTvNewsLink() {
		tvNewsLink().click();
	}
	public void clickUnd911Img() {
		understanding911Img().click();
	}
	public void clickUnd911Link() {
		understanding911Link().click();
	}
	public List<WebElement> getFeaturedListVideo() {
		return featuredListVideo();
	}
	public void clickFeaturedListVideo(Integer index) {
		getFeaturedListVideo().get(index).click();
	}
	public List<WebElement> getTopListVideo(){
		return topListVideo();
	}
	public List<WebElement> getOtherListVideo(){
		return otherListVideo();
	}
	public void clickLMArchiveImg() {
		liveMusicArchiveImg().click();
	}
	public void clickLMArchiveLink() {
		liveMusicArchiveLink().click();
	}
	public void clickLFAudioImg() {
		librivoxFreeAudiobookImg().click();
	}
	public void clickLFAudioLink() {
		librivoxFreeAudiobookLink().click();
	}
	public List<WebElement> getFeaturedListAudio() {
		return featuredListAudio();
	}
	public List<WebElement> getTopListAudio(){
		return topListAudio();
	}
	public List<WebElement> getOtherListAudio(){
		return otherListAudio();
	}
	public void clickInternetArcadeImg() {
		internetArcadeImg().click();
	}
	public void clickInternetArcadeLink() {
		internetArcadeLink().click();
	}
	public List<WebElement> getFeaturedListSoftware() {
		return featuredListSoftware();
	}
	public List<WebElement> getTopListSoftware(){
		return topListSoftware();
	}
	public List<WebElement> getOtherListSoftware(){
		return otherListSoftware();
	}
	public void clickMetropolitanMuseumImg() {
		metropolitanMuseumImg().click();
	}
	public void clickMetropolitanMuseumLink() {
		metropolitanMuseumLink().click();
	}
	public void clickBrooklynMuseumImg() {
		brooklynMuseumImg().click();
	}
	public void clickBrooklynMuseumLink() {
		brooklynMuseumLink().click();
	}
	public List<WebElement> getFeaturedListImage() {
		return featuredListSoftware();
	}
	public List<WebElement> getTopListImage(){
		return topListSoftware();
	}
}