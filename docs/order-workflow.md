# QuickBite — User Roles and Order Workflow

## 1. Overview

QuickBite is a single-restaurant food ordering and management system. Customers place orders through a self-service kiosk, restaurant staff manage food preparation, and administrators maintain the menu.

## 2. Main User Roles

### Customer
- Browse the restaurant menu and view item prices.
- Add items to the cart and review the order.
- Enter a phone number during checkout.
- Place an order and receive a unique order ID.
- Check the order status and collect the order when ready.

### Restaurant Staff
- View incoming orders on the kitchen dashboard.
- Verify order details and payment status.
- Accept orders and begin preparation.
- Update order status as preparation progresses.
- Mark orders as ready for pickup.
- Complete the order when it has been collected.

### Administrator
- Add, update, and remove menu items.
- Maintain item names, descriptions, prices, and availability.
- Ensure menu changes are reflected in the customer ordering interface.
- Manage basic application settings.

## 3. Order Workflow

1. **Browse Menu:** The customer views the restaurant menu on the kiosk.
2. **Add to Cart:** The customer selects items and quantities.
3. **Checkout:** The customer reviews the cart and enters a phone number.
4. **Place Order:** The backend validates the request, creates the order, and generates a unique order ID.
5. **Verify Payment:** The restaurant verifies the payment status according to the selected payment method.
6. **Accept Order:** Restaurant staff accept the order for preparation.
7. **Prepare Order:** Staff prepare the requested food and update its status.
8. **Ready for Pickup:** Staff mark the order as ready.
9. **Complete Order:** The customer collects the food, and the order is marked as completed.

## 4. Order Statuses

The initial planned order status flow is:

`PLACED → ACCEPTED → PREPARING → READY_FOR_PICKUP → COMPLETED`

Additional statuses, such as `CANCELLED`, can be introduced with appropriate transition rules.

Payment status is tracked separately from order status. For example, an order can be awaiting payment verification while its food preparation status remains unchanged.

## 5. High-Level Interaction

- The customer kiosk sends order requests to the backend API.
- The backend validates orders and stores them in the database.
- The kitchen dashboard retrieves orders and sends status updates through the backend.
- The admin dashboard sends menu updates through the backend.
- The backend remains the source of truth for menu data, orders, and order status.

## 6. Initial Scope and Future Improvements

The initial version focuses on menu browsing, order placement, kitchen order processing, and basic menu administration.

Future improvements may include authentication, role-based access control, payment gateway integration, real-time order updates, order cancellation rules, and reporting.

## 7. Implementation Note

This document describes the intended workflow. Features are considered implemented only after they have been developed and tested.
