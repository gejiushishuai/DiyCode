/*
 * Copyright (c) 2017 SamuelGjk <samuel.alva@outlook.com>
 *
 * This file is part of DiyCode
 *
 * DiyCode is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * DiyCode is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 *
 * See the GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with DiyCode. If not, see <http://www.gnu.org/licenses/>.
 */

package moe.yukinoneko.diycode.bean;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by SamuelGjk on 2017/4/27.
 */

public class Sites {

    @SerializedName("name") public String name;
    @SerializedName("id") public int id;
    @SerializedName("sites") public List<Site> sites;

    public static class Site {
        @SerializedName("name") public String name;
        @SerializedName("url") public String url;
        @SerializedName("avatar_url") public String avatarUrl;
    }
}
