package de.appetites.android.menuItemSearchAction;
/*
 * Copyright (C) 2012 Benjamin Mock
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/**
 * <p>Interface for the MenuItemSearchAction fore firing an event to actually perform the search</p> 
 *
 * @author Benjamin Mock <mail@benjaminmock.de>
 */
public interface SearchPerformListener {
    public abstract void performSearch(String query);
}