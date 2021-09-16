package com.stream.consumer;

public class RssModel {

	private String contentCategory;

	private String rssFeedUrl;

	private String channel;

	private String contentOwner;

	public String getContentCategory() {
		return contentCategory;
	}

	public void setContentCategory(String contentcategory) {
		this.contentCategory = contentcategory;
	}

	public String getRssFeedUrl() {
		return rssFeedUrl;
	}

	public void setRssFeedUrl(String rssfeedurl) {
		this.rssFeedUrl = rssfeedurl;
	}

	public String getChannel() {
		return channel;
	}

	public void setChannel(String channel) {
		this.channel = channel;
	}

	public String getContentOwner() {
		return contentOwner;
	}

	public void setContentOwner(String contentowner) {
		this.contentOwner = contentowner;
	}

	@Override
	public String toString() {
		return "RssModel [contentcategory=" + contentCategory + ", rssfeedurl=" + rssFeedUrl + ", channel=" + channel
				+ ", contentowner=" + contentOwner + "]";
	}

}
