
/*
 * Copyright 2014 Basit Parkar.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 *
 * @date 11/9/14 2:48 PM
 * @modified 11/9/14 9:18 AM
 */

package com.mobility.iz.retrofitdemo.webservices;

import java.util.List;

public class UserData{
   	private String avatar_url;
   	private String bio;
   	private String blog;
   	private String company;
   	private String created_at;
   	private String email;
   	private String events_url;
   	private Number followers;
   	private String followers_url;
   	private Number following;
   	private String following_url;
   	private String gists_url;
   	private String gravatar_id;
   	private boolean hireable;
   	private String html_url;
   	private Number id;
   	private String location;
   	private String login;
   	private String name;
   	private String organizations_url;
   	private Number public_gists;
   	private Number public_repos;
   	private String received_events_url;
   	private String repos_url;
   	private boolean site_admin;
   	private String starred_url;
   	private String subscriptions_url;
   	private String type;
   	private String updated_at;
   	private String url;

 	public String getAvatar_url(){
		return this.avatar_url;
	}
	public void setAvatar_url(String avatar_url){
		this.avatar_url = avatar_url;
	}
 	public String getBio(){
		return this.bio;
	}
	public void setBio(String bio){
		this.bio = bio;
	}
 	public String getBlog(){
		return this.blog;
	}
	public void setBlog(String blog){
		this.blog = blog;
	}
 	public String getCompany(){
		return this.company;
	}
	public void setCompany(String company){
		this.company = company;
	}
 	public String getCreated_at(){
		return this.created_at;
	}
	public void setCreated_at(String created_at){
		this.created_at = created_at;
	}
 	public String getEmail(){
		return this.email;
	}
	public void setEmail(String email){
		this.email = email;
	}
 	public String getEvents_url(){
		return this.events_url;
	}
	public void setEvents_url(String events_url){
		this.events_url = events_url;
	}
 	public Number getFollowers(){
		return this.followers;
	}
	public void setFollowers(Number followers){
		this.followers = followers;
	}
 	public String getFollowers_url(){
		return this.followers_url;
	}
	public void setFollowers_url(String followers_url){
		this.followers_url = followers_url;
	}
 	public Number getFollowing(){
		return this.following;
	}
	public void setFollowing(Number following){
		this.following = following;
	}
 	public String getFollowing_url(){
		return this.following_url;
	}
	public void setFollowing_url(String following_url){
		this.following_url = following_url;
	}
 	public String getGists_url(){
		return this.gists_url;
	}
	public void setGists_url(String gists_url){
		this.gists_url = gists_url;
	}
 	public String getGravatar_id(){
		return this.gravatar_id;
	}
	public void setGravatar_id(String gravatar_id){
		this.gravatar_id = gravatar_id;
	}
 	public boolean getHireable(){
		return this.hireable;
	}
	public void setHireable(boolean hireable){
		this.hireable = hireable;
	}
 	public String getHtml_url(){
		return this.html_url;
	}
	public void setHtml_url(String html_url){
		this.html_url = html_url;
	}
 	public Number getId(){
		return this.id;
	}
	public void setId(Number id){
		this.id = id;
	}
 	public String getLocation(){
		return this.location;
	}
	public void setLocation(String location){
		this.location = location;
	}
 	public String getLogin(){
		return this.login;
	}
	public void setLogin(String login){
		this.login = login;
	}
 	public String getName(){
		return this.name;
	}
	public void setName(String name){
		this.name = name;
	}
 	public String getOrganizations_url(){
		return this.organizations_url;
	}
	public void setOrganizations_url(String organizations_url){
		this.organizations_url = organizations_url;
	}
 	public Number getPublic_gists(){
		return this.public_gists;
	}
	public void setPublic_gists(Number public_gists){
		this.public_gists = public_gists;
	}
 	public Number getPublic_repos(){
		return this.public_repos;
	}
	public void setPublic_repos(Number public_repos){
		this.public_repos = public_repos;
	}
 	public String getReceived_events_url(){
		return this.received_events_url;
	}
	public void setReceived_events_url(String received_events_url){
		this.received_events_url = received_events_url;
	}
 	public String getRepos_url(){
		return this.repos_url;
	}
	public void setRepos_url(String repos_url){
		this.repos_url = repos_url;
	}
 	public boolean getSite_admin(){
		return this.site_admin;
	}
	public void setSite_admin(boolean site_admin){
		this.site_admin = site_admin;
	}
 	public String getStarred_url(){
		return this.starred_url;
	}
	public void setStarred_url(String starred_url){
		this.starred_url = starred_url;
	}
 	public String getSubscriptions_url(){
		return this.subscriptions_url;
	}
	public void setSubscriptions_url(String subscriptions_url){
		this.subscriptions_url = subscriptions_url;
	}
 	public String getType(){
		return this.type;
	}
	public void setType(String type){
		this.type = type;
	}
 	public String getUpdated_at(){
		return this.updated_at;
	}
	public void setUpdated_at(String updated_at){
		this.updated_at = updated_at;
	}
 	public String getUrl(){
		return this.url;
	}
	public void setUrl(String url){
		this.url = url;
	}

    @Override
    public String toString() {
        return "UserData{" +
                "avatar_url='" + avatar_url + '\'' +
                ", bio='" + bio + '\'' +
                ", blog='" + blog + '\'' +
                ", company='" + company + '\'' +
                ", created_at='" + created_at + '\'' +
                ", email='" + email + '\'' +
                ", events_url='" + events_url + '\'' +
                ", followers=" + followers +
                ", followers_url='" + followers_url + '\'' +
                ", following=" + following +
                ", following_url='" + following_url + '\'' +
                ", gists_url='" + gists_url + '\'' +
                ", gravatar_id='" + gravatar_id + '\'' +
                ", hireable=" + hireable +
                ", html_url='" + html_url + '\'' +
                ", id=" + id +
                ", location='" + location + '\'' +
                ", login='" + login + '\'' +
                ", name='" + name + '\'' +
                ", organizations_url='" + organizations_url + '\'' +
                ", public_gists=" + public_gists +
                ", public_repos=" + public_repos +
                ", received_events_url='" + received_events_url + '\'' +
                ", repos_url='" + repos_url + '\'' +
                ", site_admin=" + site_admin +
                ", starred_url='" + starred_url + '\'' +
                ", subscriptions_url='" + subscriptions_url + '\'' +
                ", type='" + type + '\'' +
                ", updated_at='" + updated_at + '\'' +
                ", url='" + url + '\'' +
                '}';
    }
}
