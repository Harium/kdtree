package com.harium.storage.kdtree.exception;

/**
 * KeySizeException is thrown when a KDTree method is invoked on a
 * key whose size (array length) mismatches the one used in the that
 * KDTree's constructor.
 * <p>
 * Copyright (C) Simon D. Levy 2014
 * <p>
 * This code is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 * <p>
 * This code is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * <p>
 * You should have received a copy of the GNU Lesser General Public License
 * along with this code.  If not, see <http:*www.gnu.org/licenses/>.
 * You should also have received a copy of the Parrot Parrot AR.Drone
 * Development License and Parrot AR.Drone copyright notice and disclaimer
 * and If not, see
 * <https:*projects.ardrone.org/attachments/277/ParrotLicense.txt>
 * and
 * <https:*projects.ardrone.org/attachments/278/ParrotCopyrightAndDisclaimer.txt>.
 */
public class KeySizeException extends KDException {

    public KeySizeException() {
        super("Key size mismatch");
    }

    // arbitrary; every serializable class has to have one of these
    public static final long serialVersionUID = 2L;

}
