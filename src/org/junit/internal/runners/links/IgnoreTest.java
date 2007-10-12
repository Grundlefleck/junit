/**
 * 
 */
package org.junit.internal.runners.links;

import org.junit.internal.runners.model.EachTestNotifier;

public class IgnoreTest extends NotificationStrategy {
	@Override
	public void run(EachTestNotifier context) throws Throwable {
		context.fireTestIgnored();
	}
}