package org.zwave4j;

/**
 * @author zagumennikov
 */
public enum ControllerCommand {
    NONE,
    ADD_DEVICE,
    CREATE_NEW_PRIMARY,
    RECEIVE_CONFIGURATION,
    REMOVE_DEVICE,
    REMOVE_FAILED_NODE,
    HAS_NODE_FAILED,
    REPLACE_FAILED_NODE,
    TRANSFER_PRIMARY_ROLE,
    REQUEST_NETWORK_UPDATE,
    REQUEST_NODE_NEIGHBOR_UPDATE,
    ASSIGN_RETURN_ROUTE,
    DELETE_ALL_RETURN_ROUTES,
    SEND_NODE_INFORMATION,
    REPLICATION_SEND,
    CREATE_BUTTON,
    DELETE_BUTTON
}
