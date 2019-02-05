package com.task.tree_comparison;

class Trees {
    static Node getTreeA() {
        return new Node(3,
                new Node(5,
                        new Node(4,
                                new Node(1,
                                        null,
                                        null
                                ),
                                null
                        ),
                        new Node(2,
                                null,
                                null
                        )
                ),
                new Node(7,
                        null,
                        new Node(6,
                                new Node(9,
                                        null,
                                        new Node(8,
                                                null,
                                                null
                                        )
                                ),
                                null
                        )
                )
        );
    }

    static Node getTreeB() {
        return new Node(3,
                new Node(7,
                        new Node(6,
                                null,
                                new Node(9,
                                        null,
                                        new Node(8,
                                                null,
                                                null
                                        )
                                )
                        ),
                        null
                ),
                new Node(5,
                        new Node(2,
                                null,
                                null
                        ),
                        new Node(4,
                                new Node(1,
                                        null,
                                        null
                                ),
                                null
                        )
                )
        );
    }

    static Node getTreeC() {
        return new Node(3,
                new Node(5,
                        new Node(44,
                                new Node(1,
                                        null,
                                        null
                                ),
                                null
                        ),
                        new Node(2,
                                null,
                                null
                        )
                ),
                new Node(7,
                        null,
                        new Node(6,
                                new Node(9,
                                        null,
                                        new Node(8,
                                                null,
                                                null
                                        )
                                ),
                                null
                        )
                )
        );
    }

    static Node getTreeD() {
        return new Node(3,
                new Node(5,
                        new Node(4,
                                null,
                                null
                        ),
                        new Node(2,
                                new Node(1,
                                        null,
                                        null
                                ),
                                null
                        )
                ),
                new Node(7,
                        null,
                        new Node(6,
                                new Node(9,
                                        null,
                                        new Node(8,
                                                null,
                                                null
                                        )
                                ),
                                null
                        )
                )
        );
    }
}
