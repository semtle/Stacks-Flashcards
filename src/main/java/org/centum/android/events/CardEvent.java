/**
 Stacks Flashcards - A flashcards application for Android devices 4.0+
 Copyright (C) 2014  Phani Gaddipati

 This program is free software: you can redistribute it and/or modify
 it under the terms of the GNU General Public License as published by
 the Free Software Foundation, either version 3 of the License, or
 (at your option) any later version.

 This program is distributed in the hope that it will be useful,
 but WITHOUT ANY WARRANTY; without even the implied warranty of
 MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 GNU General Public License for more details.

 You should have received a copy of the GNU General Public License
 along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.centum.android.events;

import org.centum.android.model.Card;

/**
 * Created by Phani on 3/1/14.
 */
public class CardEvent {

    private final Card source;
    private final int event;

    public CardEvent(Card source, int event) {
        this.source = source;
        this.event = event;
    }

    public Card getSource() {
        return source;
    }

    public int getEvent() {
        return event;
    }

}