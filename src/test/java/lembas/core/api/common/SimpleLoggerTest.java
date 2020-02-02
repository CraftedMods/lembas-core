/*******************************************************************************
 * Copyright (C) 2019-2020 Lembas Modding Team
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 ******************************************************************************/
package lembas.core.api.common;

import org.junit.Test;

public class SimpleLoggerTest
{

    @Test(expected = NullPointerException.class)
    public void testCreateNullName ()
    {
        SimpleLogger.create (null);
    }

    @Test(expected = NullPointerException.class)
    public void testSetProviderNullFactory ()
    {
        SimpleLogger.setProvider (null);
    }

}
