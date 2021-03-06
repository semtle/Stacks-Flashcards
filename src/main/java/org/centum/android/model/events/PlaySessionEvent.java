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
package org.centum.android.model.events;

import org.centum.android.model.Card;
import org.centum.android.model.play.PlaySession;

/**
 * Created by Phani on 3/1/14.
 */
public class PlaySessionEvent {
    private final PlaySession source;
    private final Card target;
    private final int event;

    public PlaySessionEvent(PlaySession source, Card target, int event) {
        this.source = source;
        this.event = event;
        this.target = target;
    }

    public Card getTarget() {
        return target;
    }

    public PlaySession getSource() {
        return source;
    }

    public int getEvent() {
        return event;
    }

}
