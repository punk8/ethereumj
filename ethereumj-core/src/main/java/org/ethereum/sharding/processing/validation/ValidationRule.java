/*
 * Copyright (c) [2016] [ <ether.camp> ]
 * This file is part of the ethereumJ library.
 *
 * The ethereumJ library is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * The ethereumJ library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with the ethereumJ library. If not, see <http://www.gnu.org/licenses/>.
 */
package org.ethereum.sharding.processing.validation;

import org.ethereum.sharding.domain.Beacon;

/**
 * An abstract interface for beacon chain blocks validation rule.
 *
 * @see BeaconValidator
 * @see StateValidator
 * @see ValidationResult
 *
 * @author Mikhail Kalinin
 * @since 14.08.2018
 */
public interface ValidationRule<T> {

    /**
     * Accepts block and data which block is validated against.
     *
     * @param block the block
     * @param data data that are a part of validation process
     * @return {@link ValidationResult}
     */
    ValidationResult apply(Beacon block, T data);
}
