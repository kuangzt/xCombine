/*
 * Copyright (c) 2013. wyouflf (wyouflf@gmail.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.lidroid.plugin;

/**
 * Created with IntelliJ IDEA.
 * User: wyouflf
 * Date: 13-6-17
 * Time: AM 11:53
 */
public class PluginMessage {
    private long id;
    public String content;
    public Object[] args;

    public PluginMessage(String content, Object... args) {

        if (content == null) {
            throw new IllegalArgumentException("\"content\" must not be null");
        }

        this.content = content;
        this.args = args;
        id = System.currentTimeMillis();
    }

    public long getId() {
        return id;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + content.hashCode();
        return result;
    }
}
